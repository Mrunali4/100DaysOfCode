# defined iterator and iterate through the number 5 table.

class NumberTable:
    def __init__(self,n):
        self.n = n
        self.limit =10
        self.count =1
    def __iter__(self):
        return self
    def __next__(self):
        if self.count <= self.limit:
            ans = self.n * self.count
            self.count += 1
            return ans
        else:
            raise StopIteration
        
table = iter(NumberTable(5))
while True:
    try:
        print(next(table))
    except StopIteration:
        break
