# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyManagerPermissions(object):
    """
    Compact Ontology Manager permission buckets. Principal identifiers are prefixed u: for a user, g: for a group and r: for a role.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyManagerPermissions object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param r:
            The value to assign to the r property of this OntologyManagerPermissions.
        :type r: list[str]

        :param u:
            The value to assign to the u property of this OntologyManagerPermissions.
        :type u: list[str]

        :param m:
            The value to assign to the m property of this OntologyManagerPermissions.
        :type m: list[str]

        :param a:
            The value to assign to the a property of this OntologyManagerPermissions.
        :type a: list[str]

        """
        self.swagger_types = {
            'r': 'list[str]',
            'u': 'list[str]',
            'm': 'list[str]',
            'a': 'list[str]'
        }
        self.attribute_map = {
            'r': 'r',
            'u': 'u',
            'm': 'm',
            'a': 'a'
        }
        self._r = None
        self._u = None
        self._m = None
        self._a = None

    @property
    def r(self):
        """
        Gets the r of this OntologyManagerPermissions.
        Principals with read access.


        :return: The r of this OntologyManagerPermissions.
        :rtype: list[str]
        """
        return self._r

    @r.setter
    def r(self, r):
        """
        Sets the r of this OntologyManagerPermissions.
        Principals with read access.


        :param r: The r of this OntologyManagerPermissions.
        :type: list[str]
        """
        self._r = r

    @property
    def u(self):
        """
        Gets the u of this OntologyManagerPermissions.
        Principals with use or execute access.


        :return: The u of this OntologyManagerPermissions.
        :rtype: list[str]
        """
        return self._u

    @u.setter
    def u(self, u):
        """
        Sets the u of this OntologyManagerPermissions.
        Principals with use or execute access.


        :param u: The u of this OntologyManagerPermissions.
        :type: list[str]
        """
        self._u = u

    @property
    def m(self):
        """
        Gets the m of this OntologyManagerPermissions.
        Principals with manage access.


        :return: The m of this OntologyManagerPermissions.
        :rtype: list[str]
        """
        return self._m

    @m.setter
    def m(self, m):
        """
        Sets the m of this OntologyManagerPermissions.
        Principals with manage access.


        :param m: The m of this OntologyManagerPermissions.
        :type: list[str]
        """
        self._m = m

    @property
    def a(self):
        """
        Gets the a of this OntologyManagerPermissions.
        Principals with admin access, including permission management.


        :return: The a of this OntologyManagerPermissions.
        :rtype: list[str]
        """
        return self._a

    @a.setter
    def a(self, a):
        """
        Sets the a of this OntologyManagerPermissions.
        Principals with admin access, including permission management.


        :param a: The a of this OntologyManagerPermissions.
        :type: list[str]
        """
        self._a = a

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
