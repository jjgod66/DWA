// 함수의 기본형



// 함수의 선언
const func1 = function() {
    console.log("Hello");
};
// 함수의 호출. 함수는 반드시 호출이 되어야 내부의 코드가 실행됨.
func1();



const func2 = function (x) {
// 함수선언문의 ()안의 값을 매개변수(Parameter)라고 한다.
    x = x * 2;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    return x;
};

let value2 = 2;
// 함수호출시 함수의 ()안에 넣어주는 값을 인수(Argument)라고 한다.
value2 = func2(value2);
console.log(value2);

let value3 = 3;
value3 = func2(value3);
console.log(value3);



//보이드형
const greet = function (userName) {
    console.log("Hello " + userName);
};
greet("sangjae");
//리턴형
const greet2 = function (userName) {
    let returnValue = "Hello " + userName;
    return returnValue;
};
const greet2Return = greet2("Smith");
console.log(greet2Return);



//곱하기 함수
const multiply = function (x, y) {
    return x * y;
};
const value4 = multiply(4,5);
console.log(value4);
// 또는 console.log(multiply(4,5));



//더하기 함수
const plus = function (x, y) {
    return x + y;
};
console.log(plus(2,8));



// 3개 이상의 매개변수(parameter)
const average = function (w, x, y, z) {
    return w + x + y + z;
};
console.log(average(1, 2, 3, 4));


    
// 평균구하기. 함수의 배열버전
const average2 = function (x) {
    let sum = 0;
    for (let i=0; i<x.length; i++) {
        sum = sum + x[i];
    }
    return sum / x.length; //평균을 구하기 위해 총합을 배열의 길이로 나눈다
};
const arr = [2, 3, 4, 5];
console.log(average2(arr));



//함수 선언의 다른 방법
function display() {
    console.log("Display");
};
display();
// const display = function () {
//     console.log("Display");
// };
// display();
// display = function () {
//     console.log("Displan");
// };
// display();