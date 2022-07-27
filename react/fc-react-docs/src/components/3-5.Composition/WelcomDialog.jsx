import React from 'react';
import CustomDialog from './CustomDialog';
import Dialog from './Dialog';

export default function WelcomDialog() {
  //   return (
  //     <Dialog>
  //       <h1>Welcome</h1>
  //       <h1>Thank you</h1>
  //     </Dialog>
  //   );
  return <CustomDialog title="Welcome" description="Thanks" />;
}
