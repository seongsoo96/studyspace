import { useState, useEffect } from 'react';

export default function withLoading(Component) {
  const WithLoadingComponent = (props) => {
    const [loading, setLoading] = useState(true);

    useEffect(() => {
      const timer = setTimeout(() => setLoading(false), 3000);
      return () => clearTimeout(timer);
    }, []);

    return loading ? <span>Loading...</span> : <Component {...props} />;
  };

  return WithLoadingComponent;
}
