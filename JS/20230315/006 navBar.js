const navbar = document.getElementById("navbar");
const content = document.querySelector(".content");
const offset = navbar.offsetTop;
// 1. 대상을 만든다.
// window

// 2. 함수를 만든다.
const func1 = function (e) {
    console.log(window.scrollY, offset);
    if (window.scrollY >= offset) {
        navbar.classList.add("sticky");
        // content.classList.add("topSpace"); 1번 해결법
        // content.style.marginTop = `${navbar.offsetHeight}px`; // 백틱. 2번해결법
    } else {
        navbar.classList.remove("sticky");
        // content.classList.remove("topSpace");
        // content.style.marginTop = 0; 
    };
};



// 3. 대상의 이벤트와 함수를 등록한다.
window.addEventListener("scroll", func1);


