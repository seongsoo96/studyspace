## **✨ 프로젝트 실행 방법**

### **아래 코드블럭 전체를 복사해서 한번에 실행시키면 recoil-clone 폴더만 clone 됩니다.**

```
// clone 받을 폴더에서 git 초기화
git init

// 특정 폴더(recoil-clone)만 받기 위한 설정
git config core.sparseCheckout true

// studyspace fetch
git remote add -f origin https://github.com/seongsoo96/studyspace.git

// 경로 설정
echo "recoil-clone" >> .git/info/sparse-checkout

// pull
git pull origin main

// recoil-clone 으로 이동
cd recoil-clone
```

### 설치 후 실행

```
npm install
npm start

or

yarn
yarn start
```
