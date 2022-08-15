import { rest } from 'msw';

export const handlers = [
  rest.get('/api/users', async (req, res, ctx) => {
    const pageIndex = req.url.searchParams.get('page');

    return res(
      ctx.json([
        {
          id: `1 ${pageIndex}`,
          name: `seongsoo-1 ${pageIndex}`,
        },
        {
          id: `2 ${pageIndex}`,
          name: `seongsoo-2 ${pageIndex}`,
        },
        {
          id: `3 ${pageIndex}`,
          name: `seongsoo-3 ${pageIndex}`,
        },
        {
          id: `4 ${pageIndex}`,
          name: `seongsoo-4 ${pageIndex}`,
        },
        {
          id: `5 ${pageIndex}`,
          name: `seongsoo-5 ${pageIndex}`,
        },
      ])
    );
    // return res(ctx.status(400)); // 일부로 error 내보기
  }),
  rest.get('/api/user/:userId', async (req, res, ctx) => {
    const { userId } = req.params;
    return res(
      ctx.json({
        name: `seongsoo (${userId})`,
      })
    );
    // return res(ctx.status(400)); // 일부로 error 내보기
  }),

  rest.get('/login', async (req, res, ctx) => {
    return res(
      ctx.json({
        id: 'f79e82e8-c34a-4dc7-a49e-9fadc0979fda',
        firstName: 'John',
        lastName: 'Maverick',
      })
    );
  }),

  rest.get(
    'https://raw.githubusercontent.com/techoi/raw-data-api/main/simple-api.json',
    async (req, res, ctx) => {
      const id = req.url.searchParams.get('id');

      const originalResponse = await ctx.fetch(req);
      const originalResponseData = await originalResponse.json();

      return res(
        ctx.status(403),
        // And a response body, if necessary
        ctx.json({
          errorMessage: 'Data not found',
        })
        // ctx.json({
        //   data: {
        //     people: [
        //       ...originalResponseData.data.people,
        //       {
        //         name: id,
        //         age: 135,
        //       },
        //     ],
        //   },
        // })
      );
    }
  ),
];
