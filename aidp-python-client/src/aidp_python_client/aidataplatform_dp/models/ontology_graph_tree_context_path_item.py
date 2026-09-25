# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphTreeContextPathItem(object):
    """
    Compact ontology tree path item.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphTreeContextPathItem object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param uid:
            The value to assign to the uid property of this OntologyGraphTreeContextPathItem.
        :type uid: str

        :param type:
            The value to assign to the type property of this OntologyGraphTreeContextPathItem.
        :type type: str

        :param display_name:
            The value to assign to the display_name property of this OntologyGraphTreeContextPathItem.
        :type display_name: str

        """
        self.swagger_types = {
            'uid': 'str',
            'type': 'str',
            'display_name': 'str'
        }

        self.attribute_map = {
            'uid': 'uid',
            'type': 'type',
            'display_name': 'displayName'
        }

        self._uid = None
        self._type = None
        self._display_name = None

    @property
    def uid(self):
        """
        **[Required]** Gets the uid of this OntologyGraphTreeContextPathItem.
        Stable unique identifier for the path item.


        :return: The uid of this OntologyGraphTreeContextPathItem.
        :rtype: str
        """
        return self._uid

    @uid.setter
    def uid(self, uid):
        """
        Sets the uid of this OntologyGraphTreeContextPathItem.
        Stable unique identifier for the path item.


        :param uid: The uid of this OntologyGraphTreeContextPathItem.
        :type: str
        """
        self._uid = uid

    @property
    def type(self):
        """
        **[Required]** Gets the type of this OntologyGraphTreeContextPathItem.
        Node type for the path item.


        :return: The type of this OntologyGraphTreeContextPathItem.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this OntologyGraphTreeContextPathItem.
        Node type for the path item.


        :param type: The type of this OntologyGraphTreeContextPathItem.
        :type: str
        """
        self._type = type

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this OntologyGraphTreeContextPathItem.

        :return: The display_name of this OntologyGraphTreeContextPathItem.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this OntologyGraphTreeContextPathItem.

        :param display_name: The display_name of this OntologyGraphTreeContextPathItem.
        :type: str
        """
        self._display_name = display_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
