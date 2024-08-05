package com.juyeon.example.member.service;

import com.juyeon.example.member.model.dto.SignupDTO;
import com.juyeon.example.member.model.entity.Member;
import com.juyeon.example.member.model.entity.RoleType;
import com.juyeon.example.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public void register(SignupDTO signupDTO) {
        Member member = Member.builder()
                .memberId(signupDTO.getMemberId())
                .password(passwordEncoder.encode(signupDTO.getPassword()))  // 암호화
                .name(signupDTO.getName())
                .role(RoleType.valueOf(signupDTO.getRole()))    // USER, ADMIN
                .build();

        Member savedMember = memberRepository.save(member);
        log.info("저장된 회원 번호: {}", savedMember.getMemberNo());
    }
}
