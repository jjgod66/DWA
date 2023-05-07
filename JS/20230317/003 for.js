const nums = [1, 2, 3, 4, 5];

for (let i = 0; i<nums.length; i++) {
    console.log(i + "번째 element는 " + nums[i]);
};

//ForEach
// 1. forEach는 반드시 배열에 붙여서 사용 (배열의 메소드)
// 2. forEach는 인수로서 반드시 함수를 받는다.
// 3. forEach는 함수를 호출할때 파라미터로 3가지를 넣어준다.
//    (배열의 멤버, 인덱스, 배열본인)

nums.forEach( function (element, index, array) {
    console.log(index + "번째 element는 " + element);
});
