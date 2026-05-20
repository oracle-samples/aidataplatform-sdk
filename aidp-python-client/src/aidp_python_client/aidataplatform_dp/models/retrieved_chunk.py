# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RetrievedChunk(object):
    """
    A single retrieved document chunk with metadata.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RetrievedChunk object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param document_id:
            The value to assign to the document_id property of this RetrievedChunk.
        :type document_id: str

        :param content:
            The value to assign to the content property of this RetrievedChunk.
        :type content: str

        :param score:
            The value to assign to the score property of this RetrievedChunk.
        :type score: float

        """
        self.swagger_types = {
            'document_id': 'str',
            'content': 'str',
            'score': 'float'
        }

        self.attribute_map = {
            'document_id': 'documentId',
            'content': 'content',
            'score': 'score'
        }

        self._document_id = None
        self._content = None
        self._score = None

    @property
    def document_id(self):
        """
        Gets the document_id of this RetrievedChunk.
        Unique identifier or URI for the document chunk.


        :return: The document_id of this RetrievedChunk.
        :rtype: str
        """
        return self._document_id

    @document_id.setter
    def document_id(self, document_id):
        """
        Sets the document_id of this RetrievedChunk.
        Unique identifier or URI for the document chunk.


        :param document_id: The document_id of this RetrievedChunk.
        :type: str
        """
        self._document_id = document_id

    @property
    def content(self):
        """
        Gets the content of this RetrievedChunk.
        Text content of the retrieved chunk.


        :return: The content of this RetrievedChunk.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this RetrievedChunk.
        Text content of the retrieved chunk.


        :param content: The content of this RetrievedChunk.
        :type: str
        """
        self._content = content

    @property
    def score(self):
        """
        Gets the score of this RetrievedChunk.
        Relevance score assigned to the chunk during retrieval.


        :return: The score of this RetrievedChunk.
        :rtype: float
        """
        return self._score

    @score.setter
    def score(self, score):
        """
        Sets the score of this RetrievedChunk.
        Relevance score assigned to the chunk during retrieval.


        :param score: The score of this RetrievedChunk.
        :type: float
        """
        self._score = score

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
