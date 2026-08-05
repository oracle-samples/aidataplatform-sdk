# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateOntologyFolderDetails(object):
    """
    Details for creating a folder under an ontology project root.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateOntologyFolderDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this CreateOntologyFolderDetails.
        :type path: str

        :param description:
            The value to assign to the description property of this CreateOntologyFolderDetails.
        :type description: str

        """
        self.swagger_types = {
            'path': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'path': 'path',
            'description': 'description'
        }

        self._path = None
        self._description = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this CreateOntologyFolderDetails.
        Project-relative folder path.


        :return: The path of this CreateOntologyFolderDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this CreateOntologyFolderDetails.
        Project-relative folder path.


        :param path: The path of this CreateOntologyFolderDetails.
        :type: str
        """
        self._path = path

    @property
    def description(self):
        """
        Gets the description of this CreateOntologyFolderDetails.

        :return: The description of this CreateOntologyFolderDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateOntologyFolderDetails.

        :param description: The description of this CreateOntologyFolderDetails.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
