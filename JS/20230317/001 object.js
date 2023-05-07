const carObject1 = {
  brand: "현대", // property : value (프로퍼티 : 밸류)
  model: "소나타",
  trim: "럭셔리",
  color: "흰색",
  // price는 method라고 부른다 (함수니까)
  price: function () {
    //모델명 + 트림 + 색깔 넣어서 계산
    return 3000;
  },
};

const carObject2 = {
  brand: "현대",
  model: "싼타페",
  trim: "럭셔리",
  color: "회색",
};

// console.log(carObject1.model);
// console.log(carObject2.trim);
// console.log(carObject1["model"]); //프로퍼티 이름을 배열처럼 이용하는 방법
const 가격 = carObject1.price();
console.log(가격);

const user = {
  이름: "김상재",
  성별: "남성",
  나이: "32",
  주소: "대종로",
  MBTI: "INTP",
};

console.log(user.이름);
console.log(user.성별);
console.log(user.나이);
console.log(user.주소);
console.log(user.MBTI);
