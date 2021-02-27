
    // 클래스 값이 js-toDoForm인 첫번째 요소에 접근
const toDoForm = document.querySelector('.js-toDoForm'),
    // toDoForm의 태그 값이 input인 첫번째 요소에 접근
    toDoInput = toDoForm.querySelector("input"),
    // 클래스 값이 js-toDoList인 첫번째 요소에 접근
    toDoList = document.querySelector(".js-toDoList");

const TODOS_LS = 'toDos';

// toDos 배열 선언
let toDos = [];

let idNum = 1;

function deleteToDo(event){
    const btn = event.target;
    const li = btn.parentNode;
    toDoList.removeChild(li);
    const cleanToDos = toDos.filter(function(toDo){
        return toDo.id !== parseInt(li.id);
    });
    toDos = cleanToDos;
    saveToDos();
}

// localStorage에 key값을 TODOS_LS(toDos),
// value값을 'string으로 형변환 된 toDos배열'을 저장.
function saveToDos(){
    localStorage.setItem(TODOS_LS, JSON.stringify(toDos));
}

function paintToDo(text){
    const li = document.createElement("li");

    // button에 ❌ 텍스트를 추가
    const delBtn = document.createElement('button');
    delBtn.innerText = '❌';

    // ❌버튼을 'click'하면 deleteToDo 함수 실행.
    delBtn.addEventListener('click', deleteToDo);

    // span에 text 텍스트를 추가
    const span = document.createElement('span');
    span.innerHTML = text

    const newId = idNum;
    idNum += 1;

    // li에 자식요소로 button을 추가
    li.appendChild(delBtn);
    // li에 자식요소로 span을 추가
    li.appendChild(span);
    // toDoList에 자식요소로 li 추가
    toDoList.appendChild(li);

    li.id = newId;
    const toDoObj = {
        text: text,
        id: newId // = toDos.length + 1
    };
    toDos.push(toDoObj);
    saveToDos();
}

function handleSubmit(event){
    // 1. event 발생시 동작하는 것을 막는다.
    event.preventDefault();
    // 2. toDoInput의 value값을 currentValue에 대입
    const currentValue = toDoInput.value;
    paintToDo(currentValue);
    // toDoInput의  value값을 초기화 (input의 텍스트를 제거)
    toDoInput.value = '';
}


function loadToDos(){
    const loadedToDos = localStorage.getItem(TODOS_LS);
    if(loadedToDos !== null){
        const parsedToDos = JSON.parse(loadedToDos);
        parsedToDos.forEach(function(toDo){
            paintToDo(toDo.text);
        });
    }
}

function init(){

    loadToDos();
    
    // submit 이벤트가 발생하면 handleSubmit함수가 실행된다.
    toDoForm.addEventListener('submit', handleSubmit)
}

init();