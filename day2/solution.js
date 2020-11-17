function minus5(f,l){
    var arr=[];
    for(var i=f; i<=l; i++){
        if ( Math.abs(i)%10 != 5 ) arr.push(i);
    }
    return arr.length;
}