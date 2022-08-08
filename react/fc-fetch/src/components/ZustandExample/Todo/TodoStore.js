import create from 'zustand';
import { devtools } from 'zustand/middleware';

export const useStore = create(
  devtools((set, get) => ({
    todoListState: [],
    setTodoListState: (list) => set({ todoListState: list }),
    setTodoListFilterState: (filter) => set({ todoListFilterState: filter }),
    filteredTodoListState: () => {
      const filter = get().todoListFilterState;
      const list = get().todoListState;

      switch (filter) {
        case 'Show Completed':
          return list.filter((item) => item.isComplete);
        case 'Show Uncompleted':
          return list.filter((item) => !item.isComplete);
        default:
          return list;
      }
    },
    todoListStatsState: () => {
      const todoList = get().todoListState;
      const totalNum = todoList.length;
      const totalCompletedNum = todoList.filter(
        (item) => item.isComplete
      ).length;
      const totalUncompletedNum = totalNum - totalCompletedNum;
      const percentCompleted =
        totalNum === 0 ? 0 : totalCompletedNum / totalNum;

      return {
        totalNum,
        totalCompletedNum,
        totalUncompletedNum,
        percentCompleted,
      };
    },
  }))
);
