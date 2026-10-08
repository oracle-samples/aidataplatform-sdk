# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntityPatchOperation(object):
    """
    JSON Patch-style operation. Paths are scoped to flat entity property paths.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntityPatchOperation object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param op:
            The value to assign to the op property of this OntologyEntityPatchOperation.
        :type op: str

        :param path:
            The value to assign to the path property of this OntologyEntityPatchOperation.
        :type path: str

        :param value:
            The value to assign to the value property of this OntologyEntityPatchOperation.
        :type value: object

        """
        self.swagger_types = {
            'op': 'str',
            'path': 'str',
            'value': 'object'
        }

        self.attribute_map = {
            'op': 'op',
            'path': 'path',
            'value': 'value'
        }

        self._op = None
        self._path = None
        self._value = None

    @property
    def op(self):
        """
        **[Required]** Gets the op of this OntologyEntityPatchOperation.
        Patch operation. Supported values are add, replace, and remove.


        :return: The op of this OntologyEntityPatchOperation.
        :rtype: str
        """
        return self._op

    @op.setter
    def op(self, op):
        """
        Sets the op of this OntologyEntityPatchOperation.
        Patch operation. Supported values are add, replace, and remove.


        :param op: The op of this OntologyEntityPatchOperation.
        :type: str
        """
        self._op = op

    @property
    def path(self):
        """
        **[Required]** Gets the path of this OntologyEntityPatchOperation.
        JSON pointer path such as /label, /comment, or /subClassOf/0.


        :return: The path of this OntologyEntityPatchOperation.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this OntologyEntityPatchOperation.
        JSON pointer path such as /label, /comment, or /subClassOf/0.


        :param path: The path of this OntologyEntityPatchOperation.
        :type: str
        """
        self._path = path

    @property
    def value(self):
        """
        Gets the value of this OntologyEntityPatchOperation.
        Value used by add and replace operations.


        :return: The value of this OntologyEntityPatchOperation.
        :rtype: object
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this OntologyEntityPatchOperation.
        Value used by add and replace operations.


        :param value: The value of this OntologyEntityPatchOperation.
        :type: object
        """
        self._value = value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
