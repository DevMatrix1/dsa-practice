// link- https://bigfrontend.dev/react/usePrevious

import {useEffect,useRef} from 'react';
export function usePrevious<T>(value: T): T | undefined {
  // your code here
  const previous=useRef<T|undefined>(undefined);
  useEffect(()=>{
    previous.current=value;
  },[value]);
  return previous.current;
}
