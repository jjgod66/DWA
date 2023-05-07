// const myFunc = function (a,b) {
//     return a*b;
// };
// const myFunc = (a, b) => {
//     return a*b;
// };
// const myFunc = (a, b) => a*b;
// const val = myFunc(2,3);
// console.log(val);


const btn = document.querySelector("button");
// const callback = function (e) {}
// 애로우함수로 변경
// const callback = (e) => { 
//     const h1 = document.querySelector("h1");
//     let counter = parseInt(h1.innerHTML, 10);
//     counter += 1;
//     h1.innerHTML = counter;
// }

//익명함수 (중요!!) . 함수선언시 함수 이름을 만들지 않는 것을 말한다.
btn.addEventListener("click",(e) => { 
    const h1 = document.querySelector("h1");
    let counter = parseInt(h1.innerHTML, 10);
    counter += 1;
    h1.innerHTML = counter;
});

//익명함수 스타일
const array = [1, 2, 3, 4, 5];

array.forEach((member,index)=>{
    console.log(member)
});

const func1 = function (member,index) {
    console.log(member)
};
array.forEach(func1);