const input = prompt("가위,바위,보 중 하나를 쓰세요")
let myChoice = 0;
if (input==="가위") {
    myChoice = 1;
} else if (input==="바위") {
    myChoice = 2;
} else {
    myChoice = 3;
}

let random = parseInt(Math.random()*3+1);
console.log(random);
let computerChoice = "";
//1가위 2바위 3보

if (random===1) {
    computerChoice = "가위"
} else if (random===2) {
    computerChoice = "바위"
} else {
    computerChoice = "보"
}

const myChoiceis = document.querySelector("#myChoiceis");
const computersChoiceis = document.querySelector("#computersChoiceis");
const answer = document.querySelector("#answer");

myChoiceis.innerHTML = "나의 선택은 " + input;
computersChoiceis.innerHTML = "컴퓨터의 선택은 " + computerChoice;

if ((myChoice - random) == -2 || (myChoice - random) == 1 ) {
    console.log(typeof (myChoice-random));
    answer.innerHTML = "이겼습니다"
} else if (myChoice === random) {
    answer.innerHTML = "비겼습니다"
} else {
    answer.innerHTML = "졌습니다"
};



