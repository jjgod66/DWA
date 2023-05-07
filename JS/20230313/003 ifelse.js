let hour = 12;
let greeting = "";
if (hour < 12) {
    greeting = "Good Morning";
} else if (hour < 18) {
    greeting = "Good Day";
} else {
    greeting = "Good Evening";
};
console.log(greeting);

// let login = false;
// if (login) {
//     alert("Welcome~ user!!");
// } else {
//     alert("Please login..");
// }

/*
==같으면
=== 같으면 (데이터 타입도 동일)
!=다르면
!==다르면 (데이터 타입도 고려)
>크면
<작으면
>=크거나같으면
<=작거나같으면
*/

const str = "1";
const num = 1;
if (str === num) {
    console.log("같다");
} else {
    console.log("다르다");
}

// &&(and), ||(or), !(not) 논리연산자

const x = 6;
const y = 3;
if (x>5 && y<5) {
    console.log("Window popup");
}

if (x>7 || y<5) {
    console.log("Window popup");
}

const isLoginUser = false; //is로 시작하는 변수명은 보통 boolean타입이다.
if (!isLoginUser) {
    console.log("Please Log in");
} else {
    console.log("Welcome");
}

// 삼항연산자 (if~else문의 한줄 버전)
const age = 20;
// let votable = age < 18 ? "Too young" : "Old enough";
console.log(age < 18 ? "Too young" : "Old enough");