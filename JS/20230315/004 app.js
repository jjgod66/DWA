// "resize"

// 1단계 : 이벤트의 대상을 선언
// resize 이벤트는 그 대상이 window임

// 2단계 : 콜백함수 선언
const resize = function (e) {
        const h2 = document.querySelector("h2");
        h2.innerHTML = "Just Resize";
};
const rightClick = function (e) {
        const h2 = document.querySelector("h2");
        h2.innerHTML = "Right Click 발생";
        e.preventDefault();
};


// 3단계 : 대상에게 콜백함수와 원하는 이벤트를 등록한다.
window.addEventListener("resize", resize);
window.addEventListener("contextmenu", rightClick)
//window는 브라우저가 로딩시 선언한 글로벌 변수임. (선언 불필요)
