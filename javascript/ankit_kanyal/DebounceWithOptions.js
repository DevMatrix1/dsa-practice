// link- https://bigfrontend.dev/problem/implement-debounce-with-leading-and-trailing-option

function debounce(func,wait,option ={leading:false,trailing:true}){
    let timer=null;
    return function(){
        let isInvoked=false;
  
        if(timer == null && option.leading){
      
            func.apply(this,arguments);
            isInvoked=true;
        }
        clearTimeout(timer);
        timer=setTimeout(() => {

            if(option.trailing && !isInvoked){
                func.apply(this,arguments);
            }
            timer=null;
            }, wait);
    }
}
