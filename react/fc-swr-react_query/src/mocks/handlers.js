import { rest } from 'msw';

const todos = [
  {
    id: `1`,
    title: `seongsoo 1`,
  },
  {
    id: `2`,
    title: `seongsoo 2`,
  },
  {
    id: `3`,
    title: `seongsoo 3`,
  },
  {
    id: `4`,
    title: `seongsoo 4`,
  },
  {
    id: `5`,
    title: `seongsoo 5`,
  },
];

export const handlers = [
  rest.get('/api/projects', async (req, res, ctx) => {
    const pageIndex = req.url.searchParams.get('page');

    return res(
      ctx.json({
        projects: [
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
        ],
        hasMore: pageIndex < 4,
        nextCursor: pageIndex < 4 ? parseInt(pageIndex) + 1 : undefined,
      })
    );
    // return res(ctx.status(400)); // 일부로 error 내보기
  }),
  rest.post('/api/todo', async (req, res, ctx) => {
    const { todo } = req.body;
    console.log(JSON.stringify(todo));
    todos.push(todo);
    return res(ctx.json(true));
  }),
  rest.get('/api/todos', async (req, res, ctx) => {
    return res(ctx.json(todos));
  }),

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
