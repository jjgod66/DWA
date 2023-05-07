// 배열의 메서드 중에 가장 많이 사용되는 2가지

// filter
  // 반드시 배열의 length만큼 함수를 호출함
    // 필터링 조건을 이용하여 반드시 참 또는 거짓을 리턴해야한다
  const arrayNumber = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  const checkEven = function (number) {
  if (number%2===0) { // modulo 모듈로 (나누고 나머지)
    return true;
  } else {
    return false;
  }
};
// 함수내에서 return true하는 데이터만 왼쪽 배열에 넣어준다 (왼쪽배열 == evenArray)
// 리턴받는 배열은 원본 배열과 같은 length이거나 더 작다.
const evenArray = arrayNumber.filter(checkEven);
console.log(evenArray);

const prices = [1000, 2000, null, 3000, 5000, "Thousand", 500, 8000];
//필터조건 - 3000원 이상이고 숫자인 것.
const checkPrice = function (element) {
  if  (element !== null && !isNaN(element) && element > 3000) {
    return true;
  } else {
    return false;
  }
};
const filteredPrices = prices.filter(checkPrice);
console.log(filteredPrices);


// map
const numbers = [2, 4, 6, 8, 10];
// filter와 동일하게 배열의 length만큼 함수를 호출 (배열의 멤버를 파라미터로 넣어준다)
// filter와 다르게 가공된 데이터를 리턴함!!!
function square(number) {
  return number * number;
}
// 새로 만들어진 배열은 원본과 length가 동일함
const mapNumbers = numbers.map(square);
console.log(mapNumbers);

const string = "JavaScript";
const stringArr = [...string]; // spread operator [...변수명]. 변수로 사용되는 것은 주로 배열임. 의미는 배열의 해체
const ascii =function (str) {
  return str.charCodeAt(0);
};

const asciiArr = stringArr.map(ascii);
console.log(stringArr);
console.log(asciiArr);
