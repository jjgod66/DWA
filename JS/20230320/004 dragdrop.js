// 4개의 div box에 3종류의 이벤트를 등록한다.
//      1) dragover 이미지를 드래그해서 div 위에 있을 때 발생
//      2) dragleave 1번의 dragover 이벤트가 발생한 div에서 마우스가 경계를 나가면 발생
//      3) drop 한개의 div 위에서 이미지를 드롭하면 발생

// 각 이벤트를 핸들링할 수 있는 코드 작성
//      dragover 이벤트 : 이벤트가 발생한 특정 div요소에 hovered 클래스 추가
//      dragleave 이벤트 : 이벤트가 발생한 특정 div요소에서 hovered 클래스 삭제
//      drop 이벤트 : 이벤트가 발생한 특정 div요소에 image 태그요소를 붙인다 (div에 appendChild)
const boxes = document.querySelectorAll(".box");
image = document.querySelector(".image");


for (let i=0; i<boxes.length; i++) {
    boxes[i].addEventListener("dragover", (e) => {
        // dragover 이벤트의 디폴트동작때문에 drop 이벤트가 발생하지 못함.
        e.preventDefault(); // drop이벤트를 막고있는 default동작을 중단시킴.
        boxes[i].classList.add("hovered");
    });
    boxes[i].addEventListener("dragleave", (e) => {
        boxes[i].classList.remove("hovered");
    });
    boxes[i].addEventListener("drop", (e) => {
        // boxes[i].appendChild(image);
        divCoppied = document.createElement("div");
        divCoppied.classList.add("image");
        divCoppied.setAttribute("draggable", true)
        boxes[i].appendChild(divCoppied);
        boxes[i].classList.remove("hovered");
    });
};
