# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RagResult(object):
    """
    Structured RAG result containing generated answer and retrieved document chunks.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RagResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param answer:
            The value to assign to the answer property of this RagResult.
        :type answer: str

        :param retrieved_chunks:
            The value to assign to the retrieved_chunks property of this RagResult.
        :type retrieved_chunks: list[oci.aidataplatform_dp.models.RetrievedChunk]

        """
        self.swagger_types = {
            'answer': 'str',
            'retrieved_chunks': 'list[RetrievedChunk]'
        }

        self.attribute_map = {
            'answer': 'answer',
            'retrieved_chunks': 'retrievedChunks'
        }

        self._answer = None
        self._retrieved_chunks = None

    @property
    def answer(self):
        """
        **[Required]** Gets the answer of this RagResult.
        The synthesized response generated using retrieved documents.


        :return: The answer of this RagResult.
        :rtype: str
        """
        return self._answer

    @answer.setter
    def answer(self, answer):
        """
        Sets the answer of this RagResult.
        The synthesized response generated using retrieved documents.


        :param answer: The answer of this RagResult.
        :type: str
        """
        self._answer = answer

    @property
    def retrieved_chunks(self):
        """
        **[Required]** Gets the retrieved_chunks of this RagResult.
        List of document chunks retrieved during RAG processing.


        :return: The retrieved_chunks of this RagResult.
        :rtype: list[oci.aidataplatform_dp.models.RetrievedChunk]
        """
        return self._retrieved_chunks

    @retrieved_chunks.setter
    def retrieved_chunks(self, retrieved_chunks):
        """
        Sets the retrieved_chunks of this RagResult.
        List of document chunks retrieved during RAG processing.


        :param retrieved_chunks: The retrieved_chunks of this RagResult.
        :type: list[oci.aidataplatform_dp.models.RetrievedChunk]
        """
        self._retrieved_chunks = retrieved_chunks

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
