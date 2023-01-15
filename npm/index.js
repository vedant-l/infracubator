const prompt = require('prompt-sync')();

const calculator = () => {
  console.log('Basic Calculator © (Type "/exit" to quit)');
  while (true) {
    const oneOperand = prompt('Enter operand 1: ');
    if (oneOperand === '/exit') return;
    const otherOperand = prompt('Enter operand 2: ');
    if (otherOperand === '/exit') return;
    const operator = prompt('Enter operation(+-*/): ');
    if (operator === '/exit') return;
    switch (operator) {
      case '+':
        console.log('Result: ' + (oneOperand + otherOperand));
        break;
      case '-':
        console.log('Result: ' + (oneOperand - otherOperand));
        break;
      case '*':
        console.log('Result: ' + oneOperand * otherOperand);
        break;
      case '/':
        console.log('Result: ' + oneOperand / otherOperand);
        break;
      default:
        console.log("We don't do that here.");
    }
  }
};
calculator();
