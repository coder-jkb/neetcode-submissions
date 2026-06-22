class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(set)
        cols = defaultdict(set)
        sqrs = defaultdict(set)

        for r in range(9):
            for c in range(9):
                ch = board[r][c]
                if ch == '.':
                    continue
                if (ch in rows[r] or ch in cols[c] or ch in sqrs[(r//3,c//3)]):
                    return False
                rows[r].add(ch)
                cols[c].add(ch)
                sqrs[(r//3,c//3)].add(ch)
        return True