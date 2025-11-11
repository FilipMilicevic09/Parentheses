//"() [] {}" valid
//"([])" valid
// "([)]" not valid
// 1) find the last ([{
// 2) Check the item to the right
// 3) Remove both and go again
// 4) Keep going until string empty or determined invalid
