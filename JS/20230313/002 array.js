// Array 어레이, 배열 
// 배열의 변수명은 보통 복수로 쓴다...
const arrr = [1, 3, "Smith", true]
const cars = ["jeep", "volvo", "bmw"];
console.log(cars);
console.log(cars.length);
console.log(cars[0]);
    
//Array methods 배열의 메소드

//push 배열의 제일 뒤에 아이템 추가
cars.push("Hyundai");
// cars[3] = "Hyundai"; 라고 쓸 수도 있긴 하다. js라서 가능..
console.log(cars);

//pop 배열의 마지막 아이템 삭제
cars.pop();
console.log(cars);

//slice 잘라서 담는다. 원본 훼손X
const a = cars.slice(1);
console.log(a);
console.log(cars);

const b = cars.slice(0,2);
console.log(b);
console.log(cars);

const c = cars.slice(0);
console.log(c);
console.log(cars);

//배열의 복사
//값복사와 참조복사의 차이를 알자
// const copy = cars; //참조복사
const copy = cars.slice(0); //값복사
console.log(copy);
copy[0] = "Hyundai";
console.log(copy);
console.log(cars);

//splice 삭제하기
const spliceValue = cars.splice(1,2); // 인자1 인덱스부터 인자2번째 순서까지
console.log(spliceValue);
console.log(cars);
const x = cars.splice(0,1,"현대","르노","기아");
console.log(cars);
console.log(x);

//map, filter, reduce 3대장 메소드는 나중에..

//상수로서의 배열
const 과일들 = ["사과", "배", "귤", "복숭아"];
과일들[0] = "오렌지";
console.log(과일들);
// 과일들 = ["Banana"]; //에러