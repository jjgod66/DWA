const colors = [ "SeaGreen", "SeaShell", "Sienna"];
const width_colorChange = [500, 1000, 1500];
//1단계 대상만들기
//window
//2단계 함수만들기
const func = function (e) {
        const width = window.innerWidth;
        const div = document.querySelector("div");
        div.innerHTML = width;

        for (let i = 0; i <colors.length; i++) {
                if (width>=width_colorChange[i]) {
                        document.body.style.backgroundColor = colors[i];
                }
        }

        // if (width>=1500) {
        //         document.body.style.backgroundColor = colors[0];
        // } else if (width>=1000) {
        //         document.body.style.backgroundColor = colors[1];
        // } else {
        //         document.body.style.backgroundColor = colors[2];
        // };
};

//3단계 대상에 이벤트와 함수 등록하기
window.addEventListener("resize", func);
