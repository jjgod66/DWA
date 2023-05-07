// 날짜
const d1 = new Date(); // 날짜 객체 생성자
console.log(d1);
// 날씨 객체를 만드는 여러가지 포맷 ..
const d2 = new Date("2022-03-25");
console.log(d2);
const d3 = new Date("October 13, 2014 11:13:00");
console.log(d3);
const d4 = new Date(1992, 11, 17, 10, 33, 30, 0);
console.log(d4);
const d5 = new Date(0); // year가 아니라 ms(밀리세컨드)
console.log(d5);
console.log(d1.getTime());



const date1 = new Date(); // 오늘날짜
const date2 = new Date("12/25/2023"); // 2023년 크리스마스
const diff = date2.getTime() - date1.getTime(); // 두 날짜사이 시간의 밀리세컨드
console.log(diff);
const 남은날짜 = Math.round(diff / (24*60*60*1000));
console.log(남은날짜);

// 기억해야할 내용
// 날짜를 계산할 때는 MS(밀리세컨드)로 바꿔서 한다 (getTime함수)
// getTime함수의 리턴값은 1970년 1월 1일부터 해당날짜까지의 시간을 밀리세컨드로 표시한 것

