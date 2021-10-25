package hello.core.member;

import org.w3c.dom.ls.LSOutput;

/**
 * 회원 서비스 구현체
 */

public class MemberServiceImpl implements MemberService{

    //생성자 주입
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //Test용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
