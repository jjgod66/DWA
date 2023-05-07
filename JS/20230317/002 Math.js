// Library 라이브러리
// 개발자들을 위하여 편리한 기능을 미리 만들어서 모아놓은 것

const num1 = 0.5555555555;
const num2 = 10.1;
const num3 = -4.7;

const 반올림 = Math.round(num1);
console.log(반올림);

const 버림 = Math.floor(num1);
console.log(버림);    

const 올림 = Math.ceil(num2);
console.log(올림);  

const 절대값 = Math.abs(num3);
console.log(절대값);


const x = 10;
const y = 9;
const z = 11;
console.log(Math.min(x,y,z));
console.log(Math.max(x,y,z));

const 랜덤 = Math.random(); //무작위 임의의 숫자. 범위는 0.00000~ 0.99999999~
const value = Math.floor(랜덤*10);
console.log(value);

//랜덤넘버 공식. min <= X < max 
//Masth.floor(Math.random() * (max - min)) + min;
// 101 ~999
const value2 = Math.floor(Math.random() *(1000 - 101)) + 101;
console.log(value2);