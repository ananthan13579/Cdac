function makeUpper(s){
    return s.toUpperCase();
}
const func=(s1,f1)=>{
   console.log(f1(s1));
}
func('hello',makeUpper);