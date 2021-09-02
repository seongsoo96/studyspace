
    // 클래스 값이 js-form인 첫번째 요소에 접근
    const form = document.querySelector(".js-form"),
    // 태그 값이 input인 첫번째 요소에 접근
    input = form.querySelector("input"),
    // 클래스 값이 js-greeting인 첫번째 요소에 접근
    greeting = document.querySelector(".js-greeting"),
    // id 값이 todo인 첫번째 요소에 접근
    todo = document.getElementById("todo")

const USER_LS = "currentUser",
    SHOWING_CN = "showing";

function saveName(text){
    //localStorage의 key값을 USER_LS, value값을 text로 저장한다
    localStorage.setItem(USER_LS, text)
}

function handleSubmit(event){
    // 기본 동작을 막는다(이름 입력 후 enter를 눌러도 event가 발생하지 않는다)
    event.preventDefault();
    // input의 value값을 currentValue에 저장한다.
    const currentValue = input.value;
    // greeting클래스에 Hello currentValue 텍스트를 추가한다.
    paintGreeting(currentValue);
    // currentValue값을 localStorage의 value값에 저장한다.
    saveName(currentValue);
}

function askForName(){
    form.classList.add(SHOWING_CN);
    form.addEventListener("submit", handleSubmit);
}

function paintGreeting(text){
    //form클래스에 showing클래스를 제거한다.
    form.classList.remove(SHOWING_CN)
    //greeting클래스에 showing클래스를 추가한다.
    greeting.classList.add(SHOWING_CN)
    //greeting클래스에 Hello text 텍스트를 추가한다.
    greeting.innerText = `Hello ${text}`
    //todo아이디에 form클래스를 삭제한다.
    todo.classList.remove('form')
    
}


// locatStorage에 저장된 값을 불러오는 함수
function loadName(){
    const currentUser = localStorage.getItem(USER_LS)
    if(currentUser === null){
        // 유저가 없다면
        askForName();
    } else {
        // 유저가 있다면
        paintGreeting(currentUser);
    }
}

function init(){
    loadName();
}
init();
