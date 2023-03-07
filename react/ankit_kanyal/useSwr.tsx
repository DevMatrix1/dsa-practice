// link- https://bigfrontend.dev/react/useSWR-1

import {useEffect, useState} from 'react';
export function useSWR<T = any, E = any>(
  _key: string,
  fetcher: () => T | Promise<T>
): {
  data?: T
  error?: E
} {
  // your code here
  const fetchRes = fetcher();
  const [data, setData] = useState<T | undefined>(fetchRes instanceof Promise ? undefined : fetchRes);
  const [error, setError] = useState<E | undefined>();
 
  useEffect(() => {
    if (fetchRes instanceof Promise) {
      Promise.resolve(fetchRes)
      .then(res => setData(res))
      .catch(err => setError(err))
    }
  }, []);
  return {data, error};
}
