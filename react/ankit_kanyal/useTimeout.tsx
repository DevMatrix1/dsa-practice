// link- https://bigfrontend.dev/react/usetimeout

import React, {useEffect, useRef} from 'react';

export function useTimeout(callback: () => void, delay: number) {

  const callbackRef = useRef(callback)
  callbackRef.current = callback;

  useEffect(()=> {
    const id = setTimeout(()=>callbackRef.current(),delay);
    return () => clearTimeout(id)
  }, [delay])
}
