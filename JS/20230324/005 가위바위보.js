const input = prompt("가위,바위,보 중 하나를 쓰세요")
let computer = parseInt(Math.random()*3+1);
//1가위 2바위 3보
if (computer===1) {
    computer="가위"
} else if (computer===2) {
    computer="바위"
} else if (computer===3) {
    computer="보"
}
const myChoiceis = document.querySelector("#myChoiceis");
const computersChoiceis = document.querySelector("#computersChoiceis");
const answer = document.querySelector("#answer");

myChoiceis.innerHTML = "나의 선택은 " + input;
computersChoiceis.innerHTML = "컴퓨터의 선택은 " + computer;

switch (input) {
    case "가위" :
        switch (computer) {
            case "가위" : 
                answer.innerHTML = "비겼습니다";
                break;
            case "바위" : 
                answer.innerHTML = "졌습니다";
                break;
            case "보" : 
                answer.innerHTML = "이겼습니다";
                break;
            default :
                break;
        };
        break;
    case "바위" :
        switch (computer) {
            case "가위" : 
                answer.innerHTML = "이겼습니다";
                break;
            case "바위" : 
                answer.innerHTML = "비겼습니다";
                break;
            case "보" : 
                answer.innerHTML = "졌습니다";
                break;
            default :
                break;
        };
        break;
    case "보" :
        switch (computer) {
            case "가위" : 
                answer.innerHTML = "졌습니다";
                break;
            case "바위" : 
                answer.innerHTML = "이겼습니다";
                break;
            case "보" : 
                answer.innerHTML = "비겼습니다";
                break;
            default :
                break;
        };
        break;
    default :
        break;
} 