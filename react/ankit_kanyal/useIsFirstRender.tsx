// link- https://bigfrontend.dev/react/useIsFirstRender

let isFirstRender=true;
export function useIsFirstRender(): boolean {
  // your code here
 if(isFirstRender===true){
    isFirstRender=false;
    return true;
 }
 return false;
}
