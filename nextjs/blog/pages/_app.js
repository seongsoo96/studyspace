import '../styles/global.css';
import Layout from '@components/Layout';
import { useRouter } from 'next/router';
import { format, formatDistanceToNow } from 'date-fns';
import { useState } from 'react';

export default function App({ Component, pageProps }) {
  const router = useRouter();
  const [visitedTime] = useState(new Date());

  return (
    <Layout home={router.pathname === '/'}>
      <div>
        visited:{' '}
        {formatDistanceToNow(new Date(visitedTime), {
          addSuffix: true,
          includeSeconds: true,
        })}
      </div>
      <Component {...pageProps} pathname={router.pathname} />;
    </Layout>
  );
}
