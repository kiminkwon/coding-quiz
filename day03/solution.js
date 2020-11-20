function day3(arr){
    var result=1;
    for(var i=0; i<arr.length; i++){
        var tmpArr = [];
        for(var j=0; j<arr[i].length; j++){
            tmpArr = arr[i].filter(function(item, idx){
                return arr[i].indexOf(item) == idx;
            })
        }
        result = result*(tmpArr.length);
    }
    return result;
}