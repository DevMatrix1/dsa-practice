// link- https://bigfrontend.dev/react/useDebounce

import { useState, useEffect } from 'react';

export function useDebounce<T>(value: T, delay: number): T {
  const [debounced, setDebounced] = useState(value)

  useEffect(() => {
    const timer = setTimeout(() => {
      setDebounced(value)
    }, delay);

    return () => {
      clearTimeout(timer)
    }
  }, [value, delay])

  return debounced
}
