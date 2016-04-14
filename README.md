github-flow-trial  
===============
maven プロジェクトです。 m2e プラグイン入れて使って。[M2E - Maven Integration for Eclipse]  
src/main/java がコード格納フォルダです。 Package はデフォルトで構いません。  
src/test/java がテストコード格納フォルダです。 テストコードは任意。 1

===============
1. master ブランチから clone してローカルに取り込む。
2. 各自 issue を確認し、master からブランチを作成。 ブランチ名は "‐" 区切りの機能名。
3. 実装が終わったらブランチに push する。
4. 3 の後 travis により自動ビルドが起動するので、コンパイルエラーがなかったら(テスト実装した場合はテストの正常終了)を確認して pull リクエストを送る。
5. メンバーでレビューを実施し、LGTM なんて書いてあったら 各自で master にマージを行う。(レビューでコメントも体験したいので、ごみみたいなコードがあるといいかもしれません)
6. 誰かは Project ファイルが競合するので、2 で作成したブランチに master 変更を取り込む状況が出てくるでしょう。（たぶん）

===============
https://gist.github.com/Gab-km/3705015  < ここを参考にしたよ   

===============

[![Build Status](https://travis-ci.org/devmen-sapporo/github_flow_trial.svg?branch=master)](https://travis-ci.org/devmen-sapporo/github_flow_trial)
