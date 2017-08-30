## Version Control System (VCS)

*aka Source Control Management (SCM)*




> ... Version control software keeps track of every modification 
> to the code in a special kind of database. If a mistake is made,
> developers can turn back the clock and compare earlier versions
> of the code to help fix the mistake...
>
> &mdash; <cite>[Atlassian Tutorials](https://atlassian.com/git/tutorials/what-is-version-control)</cite>




### What we (or everybody) use

[Git](https://git-scm.com), created by Linus Torvalds

<br>

### Alternatives

- [Mercurial](https://www.mercurial-scm.org/)
- [Subversion (SVN)](https://subversion.apache.org/)
- [Concurrent Versions System (CVS)](http://www.nongnu.org/cvs/)
- [Microsoft Team Foundation Server](https://www.visualstudio.com/tfs/)
- etc...




## How to use it


```bash
# 1. Install Git
# 2. Initialize / Clone Repository
$ mkdir my-project && git init && \
    git remote add origin https://github.com/nasvillanueva/new-project
## or
$ git clone https://github.com/nasvillanueva/soft-devt-presentation
# 3. Code
# 4. Stage
$ git add SomeClass.java
$ git add .
# 5. Commit
$ git commit -m "Fixed X"
# 6. Push
$ git push origin
# 7. GOTO 3;
```




## Where do you "push"?

- On-premise Server
- [GitHub](https://github.com)
- [GitLab](https://gitlab.com)
- [BitBucket](https://bitbucket.org)




## Why use it?

- Multiple people can work simultaneously
- Form of backup and never having to deal with Project-20170830.zip, Projet-20170830.zip, etc..
- For some: Never having to deal with "Kinain ng virus sa Bursal yung thesis ko :("