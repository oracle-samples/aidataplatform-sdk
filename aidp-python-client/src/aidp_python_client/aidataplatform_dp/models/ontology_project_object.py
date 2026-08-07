# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectObject(object):
    """
    Folder or file under an ontology project root.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectObject object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this OntologyProjectObject.
        :type path: str

        :param name:
            The value to assign to the name property of this OntologyProjectObject.
        :type name: str

        :param object_type:
            The value to assign to the object_type property of this OntologyProjectObject.
        :type object_type: str

        :param content_type:
            The value to assign to the content_type property of this OntologyProjectObject.
        :type content_type: str

        :param size_in_bytes:
            The value to assign to the size_in_bytes property of this OntologyProjectObject.
        :type size_in_bytes: int

        :param time_updated:
            The value to assign to the time_updated property of this OntologyProjectObject.
        :type time_updated: datetime

        """
        self.swagger_types = {
            'path': 'str',
            'name': 'str',
            'object_type': 'str',
            'content_type': 'str',
            'size_in_bytes': 'int',
            'time_updated': 'datetime'
        }

        self.attribute_map = {
            'path': 'path',
            'name': 'name',
            'object_type': 'objectType',
            'content_type': 'contentType',
            'size_in_bytes': 'sizeInBytes',
            'time_updated': 'timeUpdated'
        }

        self._path = None
        self._name = None
        self._object_type = None
        self._content_type = None
        self._size_in_bytes = None
        self._time_updated = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this OntologyProjectObject.
        Project-relative folder or file path.


        :return: The path of this OntologyProjectObject.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this OntologyProjectObject.
        Project-relative folder or file path.


        :param path: The path of this OntologyProjectObject.
        :type: str
        """
        self._path = path

    @property
    def name(self):
        """
        **[Required]** Gets the name of this OntologyProjectObject.

        :return: The name of this OntologyProjectObject.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OntologyProjectObject.

        :param name: The name of this OntologyProjectObject.
        :type: str
        """
        self._name = name

    @property
    def object_type(self):
        """
        **[Required]** Gets the object_type of this OntologyProjectObject.
        FOLDER or FILE.


        :return: The object_type of this OntologyProjectObject.
        :rtype: str
        """
        return self._object_type

    @object_type.setter
    def object_type(self, object_type):
        """
        Sets the object_type of this OntologyProjectObject.
        FOLDER or FILE.


        :param object_type: The object_type of this OntologyProjectObject.
        :type: str
        """
        self._object_type = object_type

    @property
    def content_type(self):
        """
        Gets the content_type of this OntologyProjectObject.

        :return: The content_type of this OntologyProjectObject.
        :rtype: str
        """
        return self._content_type

    @content_type.setter
    def content_type(self, content_type):
        """
        Sets the content_type of this OntologyProjectObject.

        :param content_type: The content_type of this OntologyProjectObject.
        :type: str
        """
        self._content_type = content_type

    @property
    def size_in_bytes(self):
        """
        Gets the size_in_bytes of this OntologyProjectObject.

        :return: The size_in_bytes of this OntologyProjectObject.
        :rtype: int
        """
        return self._size_in_bytes

    @size_in_bytes.setter
    def size_in_bytes(self, size_in_bytes):
        """
        Sets the size_in_bytes of this OntologyProjectObject.

        :param size_in_bytes: The size_in_bytes of this OntologyProjectObject.
        :type: int
        """
        self._size_in_bytes = size_in_bytes

    @property
    def time_updated(self):
        """
        Gets the time_updated of this OntologyProjectObject.

        :return: The time_updated of this OntologyProjectObject.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this OntologyProjectObject.

        :param time_updated: The time_updated of this OntologyProjectObject.
        :type: datetime
        """
        self._time_updated = time_updated

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
