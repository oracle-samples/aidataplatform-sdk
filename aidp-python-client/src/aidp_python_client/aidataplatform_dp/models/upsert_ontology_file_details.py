# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpsertOntologyFileDetails(object):
    """
    Details for creating or replacing an ontology source file.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpsertOntologyFileDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this UpsertOntologyFileDetails.
        :type path: str

        :param content:
            The value to assign to the content property of this UpsertOntologyFileDetails.
        :type content: str

        :param content_type:
            The value to assign to the content_type property of this UpsertOntologyFileDetails.
        :type content_type: str

        """
        self.swagger_types = {
            'path': 'str',
            'content': 'str',
            'content_type': 'str'
        }

        self.attribute_map = {
            'path': 'path',
            'content': 'content',
            'content_type': 'contentType'
        }

        self._path = None
        self._content = None
        self._content_type = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this UpsertOntologyFileDetails.
        Project-relative file path. Allowed source files use .ttl or .swrl; root project metadata must be project.yaml.


        :return: The path of this UpsertOntologyFileDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this UpsertOntologyFileDetails.
        Project-relative file path. Allowed source files use .ttl or .swrl; root project metadata must be project.yaml.


        :param path: The path of this UpsertOntologyFileDetails.
        :type: str
        """
        self._path = path

    @property
    def content(self):
        """
        **[Required]** Gets the content of this UpsertOntologyFileDetails.
        Text content for the ontology source file.


        :return: The content of this UpsertOntologyFileDetails.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this UpsertOntologyFileDetails.
        Text content for the ontology source file.


        :param content: The content of this UpsertOntologyFileDetails.
        :type: str
        """
        self._content = content

    @property
    def content_type(self):
        """
        Gets the content_type of this UpsertOntologyFileDetails.
        Optional content type. OMS infers one from the file extension when omitted.


        :return: The content_type of this UpsertOntologyFileDetails.
        :rtype: str
        """
        return self._content_type

    @content_type.setter
    def content_type(self, content_type):
        """
        Sets the content_type of this UpsertOntologyFileDetails.
        Optional content type. OMS infers one from the file extension when omitted.


        :param content_type: The content_type of this UpsertOntologyFileDetails.
        :type: str
        """
        self._content_type = content_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
