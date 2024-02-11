-------------------------------------------
|              Segment                     |
-------------------------------------------
| - p1: Point                             |
| - p2: Point                             |
-------------------------------------------
| + Segment(p1: Point, p2: Point)         |
| + Segment(x1: float, y1: float,         |
|           x2: float, y2: float)         |
| + getp1(): Point                        |
| + getp2(): Point                        |
| + setp1(point: Point): void             |
| + setp2(point: Point): void             |
| + translate(dX: float, dY: float): void |
| + length(): float                       |
| + equals(s: Segment): boolean           |
| + getSlope(): float                     |
| + getIntercept(): float                 |
| + isOnLine(p: Point): boolean           |
| + isOnSegment(p: Point): boolean        |
-------------------------------------------