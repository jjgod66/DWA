// const greet = function (userName) {
//     let returnValue = "Hello " + userName;
//     return returnValue;
// };
// const userName = prompt("이름을 적어주세요 : ");
// const greetReturn = greet(userName);
// console.log(greetReturn); 

const userName = prompt("이름을 적어주세요 : ");
const color = prompt("원하는 색을 정해주세요 : ");
const divElement =  document.querySelector("#name");

const func = function (userName, color) {
    divElement.innerHTML = userName;
    divElement.style.color = color;  
    divElement.style.fontSize = "100px";  
};

func(userName, color);
console.log(userName, color);