const btn = document.querySelector("button");
// 콜백함수의 선언. 이벤트등록보다 위에 선언해야함.
const callback = function () {
    console.log("button 태그 클릭");
};

const input = document.querySelector("input");
const func1 = function (e) {
    console.log(e);
    if (e.code === "Space") {
        console.log("Space키가 눌림");
    };
};

// 이벤트 등록. 반드시 독립적으로 사용하지말고 타겟에 붙여 사용한다.
btn.addEventListener("click", callback);
input.addEventListener("keydown", func1);
