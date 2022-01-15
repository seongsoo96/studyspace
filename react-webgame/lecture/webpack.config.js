const path = require('path');

module.exports = {
    name: 'word-relay-setting',
    mode: 'development', // 실서비스: production
    devtool: 'eval',
    resolve: {
        extensions: ['.js', '.jsx']
    },

    entry: {
        app: ['./client'], // 이미 클라이언트가 워드릴레이를 불러옴 -> 생략가능
    }, // 입력

    module: {
        rules: [{
            test: /\.jsx?/,
            loader: 'babel-loader',
            options: {
              presets: ['@babel/preset-env', '@babel/preset-react'],
            },
        }]
    },

    output: {
        path: path.join(__dirname, 'dist'),
        filename: 'app.js'
    }, // 출력
};