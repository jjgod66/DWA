// 1단계 : 이벤트의 대상을 선언
const inputTag = document.querySelector("html");
// 2단계 : 콜백함수 선언
const callback = function (e) {
        console.log(e);
        console.log(e.target.value);
        console.log(e.srcElement.value);
};
// 3단계 : 대상에게 콜백함수와 원하는 이벤트를 등록한다.
inputTag.addEventListener("change", callback);
