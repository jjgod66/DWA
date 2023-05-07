const input = document.querySelector("#input");
const div = document.querySelector("div");
const todoList = [];

const callback = function () {
    todoList.push(input.value);
    console.log(todoList, todoList.length);
    input.value = "";
    display(todoList, div); // 인수로 배열과 위치태그요소 사용 
};

const display = function (todoList, div) {
    div.innerHTML = "";
    for ( let i = 0 ; i<todoList.length ; i++ ) {
        const pTag = document.createElement("p");
        pTag.innerHTML = todoList[i];
        div.appendChild(pTag);
    }
};

