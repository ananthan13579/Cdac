function anon1(a){
    for(let i=0;i<a.length;i++){
        console.log(a[i]*2,',', i);
    }
}
const func=(a1,func1)=>{
    func1(a1);
}
func([1,2,3,4],anon1);
